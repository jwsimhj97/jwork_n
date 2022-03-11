/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.109
 * Generated at: 2022-03-10 05:37:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._03_002d10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _08_005f04_005frequestInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("utf-8"); 
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head><title>클라이언트 및 서버 정보</title><meta charset=\"utf-8\"></head>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>URL 구성 : </h2>\r\n");
      out.write("<h2>http://localhost:8090/JSPBook/08_04requestInfo.jsp</h2>\r\n");
      out.write("<h3>프로토콜 :  http</h3>\r\n");
      out.write("<h3>ip주소(=서버이름) : localhost</h3>\r\n");
      out.write("<h3>포트번호 : 8090</h3>\r\n");
      out.write("<h3>경로 : /JSPBook/08_04requestInfo.jsp</h3>\r\n");
      out.write("<dl>\r\n");
      out.write("\t<dt><strong style=\"font-weight:bolder\">localhost</strong></dt>\r\n");
      out.write("\t<dd>IPv4 주소 형식 값으로 표시: 127.0.0.1 </dd>\r\n");
      out.write("\t<dd>IPv6 주소 형식 값으로 표시: 0:0:0:0:0:0:0:1 </dd>\r\n");
      out.write("</dl>\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("\t<li>클라이언트IP = ");
      out.print( request.getRemoteAddr() );
      out.write("<br>\r\n");
      out.write("\t\t<small style=\"color:red\">localhost부분을 IPv6값을 String으로 가져 옴. String으로 반환</small>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>요청정보 길이 = ");
      out.print( request.getContentLength() );
      out.write("<br>\r\n");
      out.write("\t\t<small style=\"color:red\">클라이언트가 전송한 요청 정보의 길이(post로 보낸 데이터만)를 구함. long으로 반환</small>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>요청정보 인코딩 = ");
      out.print( request.getCharacterEncoding() );
      out.write("<br>\r\n");
      out.write("\t\t<small style=\"color:red\">클라이언트가 전송한 요청 정보의 문자셋을 구함. String으로 반환</small>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>요청정보 컨텐츠타입 = ");
      out.print( request.getContentType() );
      out.write("<br>\r\n");
      out.write("\t\t<small style=\"color:red\">클라이언트가 전송한 요청 정보(post로 보낸 데이터만)의 컨텐츠 타입을 구함. String으로 반환</small>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>요청정보 프로토콜 = ");
      out.print( request.getProtocol() );
      out.write("</li>\r\n");
      out.write("\t<li>요청정보 전송방식 = ");
      out.print( request.getMethod() );
      out.write("</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t요청 URI = ");
      out.print( request.getRequestURI() );
      out.write("<br>\r\n");
      out.write("\t\t<small style=\"color:red\">URL에서 경로를 구함. String으로 반환</small>\t\t\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t컨텍스트 경로 = ");
      out.print( request.getContextPath() );
      out.write("<br>\r\n");
      out.write("\t\t<small style=\"color:red\">현재 페이지의 컨텍스트 경로를 구함. String으로 반환</small>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>서버이름(연결시 사용한 서버 이름) = ");
      out.print( request.getServerName() );
      out.write("</li>\r\n");
      out.write("\t<li>서버포트 = ");
      out.print( request.getServerPort() );
      out.write("</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t파라미터 정보1 = ");
      out.print(request.getParameter("id"));
      out.write("<br>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write(" \t\t파라미터 정보2 = ");
      out.print(request.getParameter("name"));
      out.write("<br> \r\n");
      out.write("\t</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}