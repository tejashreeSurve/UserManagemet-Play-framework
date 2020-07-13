
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[User],MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userform : play.data.Form[User])(implicit  messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<html>
<head>
<title>
Add User
</title>
<body>
<h1>
Add User
</h1>

"""),_display_(/*15.2*/form(action = routes.UserController.save())/*15.45*/{_display_(Seq[Any](format.raw/*15.46*/("""
"""),_display_(/*16.2*/inputText(userform("user.fName"))),format.raw/*16.35*/("""
"""),_display_(/*17.2*/inputText(userform("user.lName"))),format.raw/*17.35*/("""
"""),_display_(/*18.2*/inputText(userform("user.mName"))),format.raw/*18.35*/("""
"""),_display_(/*19.2*/inputText(userform("user.emil"))),format.raw/*19.34*/("""
"""),_display_(/*20.2*/inputText(userform("user.password"))),format.raw/*20.38*/("""

"""),format.raw/*22.1*/("""<input type ="submit" value="Add User">
""")))}),format.raw/*23.2*/("""
"""),format.raw/*24.1*/("""</body>
</head>



</html>"""))
      }
    }
  }

  def render(userform:play.data.Form[User],messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(userform)(messagesProvider)

  def f:((play.data.Form[User]) => (MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (userform) => (messagesProvider) => apply(userform)(messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-10T17:36:47.165498
                  SOURCE: /home/teju/Downloads/play-sample-project/app/views/addUser.scala.html
                  HASH: a66e77d5a5da88bfc6b18d30d0b7c3fcf67332ad
                  MATRIX: 940->1|1092->83|1136->81|1163->99|1190->100|1285->169|1337->212|1376->213|1404->215|1458->248|1486->250|1540->283|1568->285|1622->318|1650->320|1703->352|1731->354|1788->390|1817->392|1888->433|1916->434
                  LINES: 27->1|30->3|33->2|34->4|35->5|45->15|45->15|45->15|46->16|46->16|47->17|47->17|48->18|48->18|49->19|49->19|50->20|50->20|52->22|53->23|54->24
                  -- GENERATED --
              */
          