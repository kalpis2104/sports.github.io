<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
    <head>
        <link rel="stylesheet" href="newcss.css" type="text/css"/>
    <head>
    <body>
            <div class="header">
            <h1>TRAINING 4U</h1>
        </div>
       <!-- Navigation -->
<div class="navbar">
  <a href="index.html">Home</a>
  <a href="sport.xhtml">Sport</a>
  <a href="lesson.xhtml">Lesson</a>
  <a href="booking.xhtml">Booking Lesson</a>
  <a href="#" class="right">About Us</a>
</div>

<h:form>
            <view>
                <dataTable value="#{SportBean.sportList}" var="item">
            <column>
                <facet name="header">
                    Sport Number
                </facet>
                #{item.sportno}
            </column> 
            <column>
                <facet name="header">
                    Sport Name
                </facet>
                #{item.sportname}
            </column> 
            <column>
                <facet name="header">
                    Sport Description
                </facet>
                #{item.sportdescription}
            </column> 
            <column>
                <facet name="header">
                    Indoor
                </facet>
                #{item.indoor}
            </column> 
                </dataTable>
                </view>
        </form>
    </body>
