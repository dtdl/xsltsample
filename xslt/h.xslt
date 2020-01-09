<?xml version="1.0" encoding="iso-8859-1"?>

<xsl:stylesheet version="1.0"  
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">  
<xsl:template match="/">

<html>

<head>

<title>First XSLT example</title>

</head>

<body>

<p><xsl:value-of select="greeting"/></p>


    <p><xsl:if test="greeting = 'BBUNQTCK' ">  TICKER    </xsl:if></p>
	<p><xsl:if test="greeting = 'BBUNQTCK' ">  TICKER    </xsl:if></p>

</body>

</html>

</xsl:template>

</xsl:stylesheet>