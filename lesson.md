<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
    <h:head>
        <title>Facelet Title</title>
        <link rel="stylesheet" href="newcss.css" type="text/css"/>
    </h:head>
    <h:body>
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
        <h1><h:outputText value="Lessons Provided"/></h1>
        <h:form>
            <f:view>
                <h:dataTable id="table" value="#{lessonBean.lessonList}" var="item">
            <h:column>
                <f:facet name="header">
                    Lesson Number
                </f:facet>
                #{item.lessonno}
            </h:column> 
            <h:column>
                <f:facet name="header">
                    Sport Number
                </f:facet>
                #{item.sportno}
            </h:column> 
            <h:column>
                <f:facet name="header">
                    Instructor Number
                </f:facet>
                #{item.instructorno}
            </h:column> 
            <h:column>
                <f:facet name="header">
                    Date
                    
                </f:facet>
                #{item.ldate}
            </h:column> 
            <h:column>
                <f:facet name="header">
                    Start Time
                </f:facet>
                #{item.starttime}
            </h:column>
            <h:column>
                <f:facet name="header">
                    End Time
                </f:facet>
                #{item.endtime}
            </h:column>
            <h:column>
                <f:facet name="header">
                    Price
                </f:facet>
                #{item.price}
            </h:column>
            <h:column>
                <f:facet name="header">
                    Booking
                </f:facet>
                
                <a href="booking.xhtml">Book</a>
                    </h:column>
        </h:dataTable>
            </f:view>
        </h:form>
    </h:body>
</html>

