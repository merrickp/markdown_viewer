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
    
    def convertedstr = "#md *" #> toXHTML(knockoff(
"""A First Level Header
====================

A Second Level Header
---------------------

The quick brown fox jumped over the lazy
dog's back.

### Header 3
#### Header 4
##### Header 5
###### Header 6

> This is a blockquote.
> 
> This is the second paragraph in the blockquote.
>
> ## This is an H2 in a blockquote

# Emphasis:  
Emphasis, aka italics, with *asterisks* or _underscores_.  
Strong emphasis, aka bold, with **asterisks** or __underscores__.  
Combined emphasis with **asterisks and _underscores_**.

# Unordered lists:
* An item in a bulleted (unordered) list
    + A subitem, indented with 4 spaces
* Another item in a bulleted list
* Here's another item

# Ordered Lists:

1. Actual numbers don't matter, just that it's a number
1. Second line item.
1. Third line item.
    1. Ordered sub-list
4. And another item. 

# Link:
This is an [example link](http://example.com/).

Image:

![alt text](http://google.com/images/google_favicon_128.png "Title")
        
"""))

    def convertedurl = "#md *" #> toXHTML(knockoff(scala.io.Source.fromURL("https://raw.github.com/merrickp/markdown_viewer/master/README.md").mkString)) 
        	

        
}