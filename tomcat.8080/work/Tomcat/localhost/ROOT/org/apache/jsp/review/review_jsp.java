/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2023-07-24 13:37:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.review;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class review_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/Users/leekyuho/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("file:/Users/leekyuho/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar", Long.valueOf(1689735699011L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"kr\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>home</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"home.jsp\">Book</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">메인</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                        국내 도서\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">문학</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">경제</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">교육</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                        해외 도서\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">문학</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">경제</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">교육</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">책 서평</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                        회원관리\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./user/form.jsp\">회원가입</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">마이페이지</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">장바구니</a></li>\n");
      out.write("                        <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">로그인</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\">로그아웃</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <form class=\"d-flex\" role=\"search\">\n");
      out.write("                <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<!-- 상단 끝-->\n");
      out.write("\n");
      out.write("<section class=\"container\">\n");
      out.write("    <form method=\"get\" action=\"#\" class=\"d-flex mt-3\">\n");
      out.write("        <select name=\"genre\" class=\"d-flex mx-1\">\n");
      out.write("            <option value=\"문학\">문학</option>\n");
      out.write("            <option value=\"경제\">경제</option>\n");
      out.write("            <option value=\"교육\">교육</option>\n");
      out.write("        </select>\n");
      out.write("        <input type=\"text\" name=\"search\" class=\"d-flex\" placeholder=\"책 제목을 입력하세요\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary mx-1 mt-6\">검색</button>\n");
      out.write("        <a class=\"btn btn-primary mx-1 mt-6\" data-bs-toggle=\"modal\" href=\"#registerModal\">등록</a>\n");
      out.write("        <a class=\"btn btn-danger mx-1 mt-6\" data-bs-toggle=\"modal\" href=\"#reportModal\">신고</a>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <div class=\"card bg-light mt-3\">\n");
      out.write("        <div class=\"card-header bg-light\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-8 text-left\">그리고 아무도 없었다&nbsp;<small>애거사 크리스티</small></div>\n");
      out.write("                <div class=\"col-4 text-right\">평점&nbsp;<span style=\"color:red\">9</span></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card-body bg-light\">\n");
      out.write("        <h5 class=\"card-title mx-3\">그리고 아무도 없었다 읽고 감동&nbsp;<small>이규호</small></h5>\n");
      out.write("        <p class=\"card-text mx-3 mt-3\">역시 애거사 크리스티</p>\n");
      out.write("\n");
      out.write("        <div class=\"container px-4 text-center\">\n");
      out.write("            <div class=\"row gx-2\">\n");
      out.write("                <div class=\"col-8\">\n");
      out.write("                    <div class=\"p-3\">\n");
      out.write("                        내용 <span>9</span>\n");
      out.write("                        전문성 <span>9</span>\n");
      out.write("                        논리 <span>9</span>\n");
      out.write("                            <span style=\"color: darkgreen\">(도움: 10)</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4 text-right\">\n");
      out.write("                    <div class=\"p-3\">\n");
      out.write("                        <a onclick=\"return confirm('도움이 되셨습니가?')\" href=\"#\">도움</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"registerModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"modal\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal=header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"modal\">서평 등록</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form action=\"#\" method=\"post\">\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-sm-6\">\n");
      out.write("                            <label>책 제목</label>\n");
      out.write("                            <input type=\"text\" name=\"bookName\" class=\"form-control\" maxlength=\"20\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group col-sm-6\">\n");
      out.write("                            <label>저자</label>\n");
      out.write("                            <input type=\"text\" name=\"bookWriter\" class=\"form-control\" maxlength=\"20\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div clas=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-sm-4\">\n");
      out.write("                            <label for=\"startDate\">시작 날짜</label>\n");
      out.write("                            <input type=\"text\" name=\"startDate\" id=\"startDate\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-sm-4\">\n");
      out.write("                            <label for=\"endDate\">완료 날짜</label>\n");
      out.write("                            <input type=\"text\" name=\"endDate\" id=\"endDate\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form group col-sm-4\">\n");
      out.write("                            <label>장르</label>\n");
      out.write("                            <select name=\"genre\" class=\"form-control\">\n");
      out.write("                                <option value=\"문학\" selected>문학</option>\n");
      out.write("                                <option value=\"경제\">경제</option>\n");
      out.write("                                <option value=\"교육\">교육</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>제목</label>\n");
      out.write("                        <input type=\"text\" name=\"reviewName\" class=\"form-control\" maxlength=\"30\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>내용</label>\n");
      out.write("                        <textarea name=\"reviewContent\" class=\"form-control\" maxlength=\"2048\" style=\"height: 180px\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <!--내뇽,전문성,논리 세가지를 기준으로 5점만점으로 평균을 내는 로직 -->\n");
      out.write("                        <div class=\"form-group col-sm-4\">\n");
      out.write("                            <label for=\"contentScore\">내용</label>\n");
      out.write("                            <input type=\"number\" name=\"contentScore\" id=\"contentScore\" class=\"form-control\" min=\"0\" max=\"5\" step=\"0.1\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-sm-4\">\n");
      out.write("                            <label for=\"expertiseScore\">전문성</label>\n");
      out.write("                            <input type=\"number\" name=\"expertiseScore\" id=\"expertiseScore\" class=\"form-control\" min=\"0\" max=\"5\" step=\"0.1\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-sm-4\">\n");
      out.write("                            <label for=\"logicScore\">논리</label>\n");
      out.write("                            <input type=\"number\" name=\"logicScore\" id=\"logicScore\" class=\"form-control\" min=\"0\" max=\"5\" step=\"0.1\">\n");
      out.write("                        </div>\n");
      out.write("                        <!-- 평균 계산 -->\n");
      out.write("                        <div class=\"form-group col-sm-4\">\n");
      out.write("                            <label for=\"averageScore\">평균 점수</label>\n");
      out.write("                            <input type=\"text\" id=\"averageScore\" class=\"form-control\" readonly>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">취소</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\">등록</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    // 평균 계산 및 결과 표시\n");
      out.write("    function calculateAverage() {\n");
      out.write("        const contentScore = parseFloat(document.getElementById(\"contentScore\").value);\n");
      out.write("        const expertiseScore = parseFloat(document.getElementById(\"expertiseScore\").value);\n");
      out.write("        const logicScore = parseFloat(document.getElementById(\"logicScore\").value);\n");
      out.write("\n");
      out.write("        const averageScore = (contentScore + expertiseScore + logicScore) / 3;\n");
      out.write("        document.getElementById(\"averageScore\").value = averageScore.toFixed(1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // 입력 필드의 값이 변경될 때마다 평균 계산 실행\n");
      out.write("    document.getElementById(\"contentScore\").addEventListener(\"input\", calculateAverage);\n");
      out.write("    document.getElementById(\"expertiseScore\").addEventListener(\"input\", calculateAverage);\n");
      out.write("    document.getElementById(\"logicScore\").addEventListener(\"input\", calculateAverage);\n");
      out.write("</script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js\" integrity=\"sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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