package com.chainup.operate.jpage;

public class JPage {

	/** 查询出数据库的总记录数 */
	private int totalRecord;

	/** 页面跳转按钮们,包括中间的页码输入框,的HTML代码 */
	private String buttons;
	
	/** 页面跳转按钮们,包括中间的页码输入框,的HTML代码 */
    private String pageSizeButton;

	/** 每页记录数 */
	private Integer pageSize;

	/** 首页按钮的HTML代码 */
	private String firstPage;

	/** 上一页按钮的HTML代码 */
	private String prePage;

	/** 当前页数 */
	private int currentPage;

	/** 所有页面列表 */
	private String listPage;

	/** 下一页按钮的HTML代码 */
	private String nextPage;

	/** 尾页按钮的HTML代码 */
	private String lastPage;

	/** 页面跳转页码输入框的HTML代码 */
	private String pageForward;

	/** 总页数 */
	private int pageTotal;

	/** 验证写入跳转页码输入框的数据的javascript代码 */
	private String javascript;

	/** 跳转页面输入框的javascript验证是否启动(启动则会在按钮HTML代码输入处会有javascript) */
	private Boolean jsEnable;

	/**
	 * 跳转页面按钮链接地址的前段,如:"LoginServlet?action=login&type=user"
	 */
	private String url;

	/**
	 * 跳转页面按钮链接地址,如:"LoginServlet?action=login&type=user&page=5";page的值是当前用户请求页数
	 */
	private String urlAddPage;

	/** urlAddPage字符串里的servlet名 **/
	private String urlAddPageServlet;

	/** 描述页面跳转按钮的文字,默认为"首页" */
	private String firstPageWord;

	/** 描述页面跳转按钮的文字,默认为"上一页" */
	private String prePageWord;

	/** 描述页面跳转按钮的文字,默认为"下一页" */
	private String nextPageWord;

	/** 描述页面跳转按钮的文字,默认为"末页" */
	private String lastPageWord;
	
	private String pageSizeTitle;
	
	private String totalCountTitle;
	
	private String recordCountStr;

	/**
	 * @param 跳转页面按钮链接地址的前段
	 *            ,如:LoginServlet?action=login&type=user
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param 跳转页面输入框的javascript验证是否启动
	 *            (启动则会在按钮HTML代码输入处会有javascript)
	 */
	public void setJsEnable(Boolean jsEnable) {
		this.jsEnable = jsEnable;
	}

	/**
	 * @param 总页数
	 */
	protected void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	/**
	 * @return the pageTotal
	 */
	public String getPageTotal() {
		String pagetotal = "";// " 共 "+pageTotal+"&nbsp;&nbsp;" ;
		return pagetotal;
	}

	/**
	 * @return 页面跳转按钮们,包括中间的页码输入框,的HTML代码
	 */
	public String getButtons() {
		if (buttons == null) {
			buttons = "<div class='page_title'>" + getCurrentPage() + "  " + getPageTotal() + "  " + getFirstPage() + "   " + getPrePage() + "   " + getListPage() + "   " + getNextPage() + "   " + getLastPage() + "</div>   " + getPageForward() + getJavascript();
		}
		return buttons;
	}

	/**
     * @return 每页显示记录数的HTML代码
     */
	public String getPageSizeButton() {
	    if (pageSizeButton == null) {
	        if(pageSize==20){
	            pageSizeButton = "<div class='page_title' style='float:left'>"+this.pageSizeTitle+" <a class='page_btn cursor active' href='"+url+"&pageSize=20'>20</a>  <a class='page_btn cursor' href='"+url+"&pageSize=40'>40</a>  <a class='page_btn cursor' href='"+url+"&pageSize=60'>60</a>  <a class='page_btn cursor' href='"+url+"&pageSize=100'>100</a>&nbsp;&nbsp;&nbsp;"+totalCountTitle+" &nbsp;"+totalRecord+"&nbsp;"+recordCountStr+"</div>"; 
	        }else if(pageSize==40){
	            pageSizeButton = "<div class='page_title' style='float:left'>"+this.pageSizeTitle+" <a class='page_btn cursor' href='"+url+"&pageSize=20'>20</a>  <a class='page_btn cursor active' href='"+url+"&pageSize=40'>40</a>  <a class='page_btn cursor' href='"+url+"&pageSize=60'>60</a>  <a class='page_btn cursor' href='"+url+"&pageSize=100'>100</a>&nbsp;&nbsp;&nbsp;"+totalCountTitle+" &nbsp;"+totalRecord+"&nbsp;"+recordCountStr+"</div>";
	        }else if(pageSize==60){
	            pageSizeButton = "<div class='page_title' style='float:left'>"+this.pageSizeTitle+" <a class='page_btn cursor' href='"+url+"&pageSize=20'>20</a>  <a class='page_btn cursor' href='"+url+"&pageSize=40'>40</a>  <a class='page_btn cursor active' href='"+url+"&pageSize=60'>60</a>  <a class='page_btn cursor' href='"+url+"&pageSize=100'>100</a>&nbsp;&nbsp;&nbsp;"+totalCountTitle+" &nbsp;"+totalRecord+"&nbsp;"+recordCountStr+"</div>";
            }else if(pageSize==100){
                pageSizeButton = "<div class='page_title' style='float:left'>"+this.pageSizeTitle+" <a class='page_btn cursor' href='"+url+"&pageSize=20'>20</a>  <a class='page_btn cursor' href='"+url+"&pageSize=40'>40</a>  <a class='page_btn cursor' href='"+url+"&pageSize=60'>60</a>  <a class='page_btn cursor active' href='"+url+"&pageSize=100'>100</a>&nbsp;&nbsp;&nbsp;"+totalCountTitle+" &nbsp;"+totalRecord+"&nbsp;"+recordCountStr+"</div>";
            }else{
                pageSizeButton = "<div class='page_title active' style='float:left'>"+this.pageSizeTitle+" <a class='page_btn cursor' href='"+url+"&pageSize=20'>20</a>  <a class='page_btn cursor' href='"+url+"&pageSize=40'>40</a>  <a class='page_btn cursor' href='"+url+"&pageSize=60'>60</a>  <a class='page_btn cursor' href='"+url+"&pageSize=100'>100</a>&nbsp;&nbsp;&nbsp;"+totalCountTitle+" &nbsp;"+totalRecord+"&nbsp;"+recordCountStr+"</div>"; 
            }
	        
        }
        return pageSizeButton;
    }

	/**
	 * @param 页面跳转按钮们
	 *            ,包括中间的页码输入框,的HTML代码
	 */
	public void setButtons(String buttons) {
		this.buttons = buttons;
	}

	/**
	 * @return 首页按钮的HTML代码
	 */
	public String getFirstPage() {
		// 不为空说明用户自己设置了
		if (firstPage == null) {
			if (currentPage != 1) {
				firstPage = "<a href=\"" + url + "&page=1"+"&pageSize="+this.pageSize + "\">" + firstPageWord + "</a>&nbsp;";
			} else {
				firstPage = firstPageWord;
			}
		}
		return firstPage;
	}

	/**
	 * @param 首页按钮的HTML代码
	 */
	public void setFirstPage(String firstPage) {
		this.firstPage = firstPage;
	}

	/**
	 * @return 上一页按钮的HTML代码
	 */
	public String getPrePage() {
		// 不为空说明用户自己设置了
		if (prePage == null) {
			if (currentPage != 1) {
				prePage = "<a href=\"" + url + "&page=" + (currentPage - 1)+"&pageSize="+this.pageSize + "\">" + prePageWord + "</a>&nbsp;";
			} else {
				prePage = prePageWord;
			}
		}
		return prePage;
	}

	public String getListPage() {
		listPage = "";
		if (pageTotal <= 9) {
			for (int i = 1; i <= pageTotal; i++) {
				listPage += "<a class=\"page_btn";
				if (currentPage == i) {
					listPage += " active";
				}
				listPage += "\" href=\"" + url + "&page=" + i +"&pageSize="+this.pageSize+ "\">" + i + "</a>";
			}
		} else {

			int start = 1;
			int end = 9;
			if (currentPage > 4) {
				start = currentPage - 4;
				end = currentPage + 4;
			}

			if (end > pageTotal) {
				end = pageTotal;
				start = pageTotal - 9  > 0 ? pageTotal - 9 : 1;
			}

			for (int i = start; i <= end; i++) {
				listPage += "<a class=\"page_btn";
				if (currentPage == i) {
					listPage += " active";
				}
				listPage += "\" href=\"" + url + "&page=" + i +"&pageSize="+this.pageSize+ "\">" + i + "</a>";
			}
		}
		return listPage;
	}

	/**
	 * @param 上一页按钮的HTML代码
	 */
	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}

	/**
	 * @return 当前页数
	 */
	public String getCurrentPage() {
		return "";// "当前 "+currentPage;
	}

	/**
	 * @param 当前页数
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return 下一页按钮的HTML代码
	 */
	public String getNextPage() {
		if (nextPage == null) {
			if (currentPage != pageTotal) {
				nextPage = "<a href=\"" + url + "&page=" + (currentPage + 1)+"&pageSize="+this.pageSize + "\">" + nextPageWord + "</a>&nbsp;";
			} else {
				nextPage = nextPageWord;
			}
		}
		return nextPage;
	}

	/**
	 * @param 下一页按钮的HTML代码
	 */
	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	/**
	 * @return 尾页按钮的HTML代码
	 */
	public String getLastPage() {
		if (lastPage == null) {
			if (currentPage != pageTotal) {
				lastPage = "<a href=\"" + url + "&page=" + pageTotal+"&pageSize="+this.pageSize + "\">" + lastPageWord + "</a>";
			} else {
				lastPage = lastPageWord;
			}
		}
		return lastPage;
	}

	/**
	 * @param 尾页按钮的HTML代码
	 */
	public void setLastPage(String lastPage) {
		this.lastPage = lastPage;
	}

	/**
	 * @return 页面跳转页码输入框的HTML代码
	 */
	public String getPageForward() {
		if (pageForward == null) {
			pageForward = "<div class='incentives_content_page_center'><input id=\"jpageforword\" type=\"text\" size=\"3\" onkeydown=\"if(event.keyCode==13)checkPageInput(this.value)\"/></div><div class='incentives_content_page_right'><input type=\"button\" onclick=\"checkPageInput()\" style='width: 25; height: 20' value='GO'></input></div>";
		}
		return "";// pageForward;
	}

	/**
	 * @param 页面跳转页码输入框的HTML代码
	 */
	public void setPageForward(String pageForward) {
		this.pageForward = pageForward;
	}

	/**
	 * @return 验证写入跳转页码输入框的数据的javascript代码
	 */
	public String getJavascript() {
		if (javascript == null) {
			if (jsEnable) {
				javascript = "<script type='text/javascript'>function checkPageInput(page) {var page = document.getElementById('jpageforword').value;" + "if(page=='') {alert('" + JPageErrors.javascriptError + "');} else if (isNaN(page))	{alert('" + JPageErrors.javascriptError + "');} else if (page>" + pageTotal + "||page<=0) {alert('" + JPageErrors.javascriptError + "');} else {window.location.href='" + url + "&page='+page;}}</script>";
			} else {
				javascript = "<script type='text/javascript'>function checkPageInput(page) {var page = document.getElementById('jpageforword').value;window.location.href='" + url + "&page='+page;}</script>";
			}
		}
		return "";// javascript;
	}

	/**
	 * @param 验证写入跳转页码输入框的数据的javascript代码
	 */
	public void setJavascript(String javascript) {
		this.javascript = javascript;
	}

	/**
	 * @return 描述页面跳转按钮的文字,默认为"首页"
	 */
	public String getFirstPageWord() {
		return firstPageWord;
	}

	/**
	 * @param 描述页面跳转按钮的文字
	 *            ,默认为"首页"
	 */
	public void setFirstPageWord(String firstPageWord) {
		this.firstPageWord = firstPageWord;
	}

	/**
	 * @return 描述页面跳转按钮的文字,默认为"上一页"
	 */
	public String getPrePageWord() {
		return prePageWord;
	}

	/**
	 * @param 描述页面跳转按钮的文字
	 *            ,默认为"上一页"
	 */
	public void setPrePageWord(String prePageWord) {
		this.prePageWord = prePageWord;
	}

	/**
	 * @return 描述页面跳转按钮的文字,默认为"下一页"
	 */
	public String getNextPageWord() {
		return nextPageWord;
	}

	/**
	 * @param 描述页面跳转按钮的文字
	 *            ,默认为"下一页"
	 */
	public void setNextPageWord(String nextPageWord) {
		this.nextPageWord = nextPageWord;
	}

	/**
	 * @return 描述页面跳转按钮的文字,默认为"末页"
	 */
	public String getLastPageWord() {
		return lastPageWord;
	}

	/**
	 * @param 描述页面跳转按钮的文字
	 *            ,默认为"末页"
	 */
	public void setLastPageWord(String lastPageWord) {
		this.lastPageWord = lastPageWord;
	}

	/**
	 * @param 拿到设置的每页记录数
	 */
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
	    this.pageSize = pageSize;
    }

	/**
	 * @return urlAddPage 跳转页面按钮链接地址,如:"LoginServlet?action=login&type=user&page=5";page的值是当前用户请求页数
	 */
	public String getUrlAddPage() {
		if (urlAddPage == null) {
			// 防止因只有page一个parameter而出现LoginServlet?&page=3这样的情况,这段有些麻烦
			if (url.indexOf("=") == -1) {// 这里应该用=而不是用?
				if (url.indexOf("?") == -1) {
					urlAddPage = url + "?page=" + this.currentPage+"&pageSize="+this.pageSize;
				} else {
					urlAddPage = url + "&page=" + this.currentPage+"&pageSize="+this.pageSize;
				}
			} else {
				urlAddPage = url + "&page=" + this.currentPage;
			}
		}
		if (urlAddPageServlet != null) {
			urlAddPage = urlAddPageServlet + "?" + urlAddPage.substring(url.indexOf("?") + 1);
		}
		return urlAddPage;
	}

	/**
	 * @param urlAddPage
	 *            跳转页面按钮链接地址,如:"LoginServlet?action=login&type=user&page=5";page的值是当前用户请求页数
	 */
	public void setUrlAddPage(String urlAddPage) {
		this.urlAddPage = urlAddPage;
	}

	/**
	 * @param urlServlet
	 *            url字符串里的servlet名
	 */
	public void setUrlServlet(String urlServlet) {
		if (urlServlet != null && url != null) {
			url = urlServlet + "?" + url.substring(url.indexOf("?") + 1);
		}
	}

	/**
	 * @param urlAddPageServlet
	 *            urlAddPage字符串里的servlet名
	 */
	public void setUrlAddPageServlet(String urlAddPageServlet) {
		this.urlAddPageServlet = urlAddPageServlet;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	protected void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

    public void setPageSizeButton(String pageSizeButton) {
        this.pageSizeButton = pageSizeButton;
    }

	public String getPageSizeTitle() {
		return pageSizeTitle;
	}

	public void setPageSizeTitle(String pageSizeTitle) {
		this.pageSizeTitle = pageSizeTitle;
	}

	public String getTotalCountTitle() {
		return totalCountTitle;
	}

	public void setTotalCountTitle(String totalCountTitle) {
		this.totalCountTitle = totalCountTitle;
	}

	public String getRecordCountStr() {
		return recordCountStr;
	}

	public void setRecordCountStr(String recordCountStr) {
		this.recordCountStr = recordCountStr;
	}

}