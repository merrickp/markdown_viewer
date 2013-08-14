package code
package snippet

import com.tristanhunt.knockoff._
import com.tristanhunt.knockoff.DefaultDiscounter._

import scala.xml.{NodeSeq, Text}

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import Helpers._
import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import Helpers._


class MarkdownConvert {

//    def displayString = "#md *" #> "afasdf"
    
    def convertedstr = "#md *" #> toXHTML(knockoff("""# My Markdown Content
        1. Item 1
        2. Item 2
        3. Item 3
        """))

}