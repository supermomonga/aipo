package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTWikiHistory was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTWikiHistory extends org.apache.cayenne.CayenneDataObject {

    public static final String NOTE_PROPERTY = "note";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String UPDATE_USER_ID_PROPERTY = "updateUserId";
    public static final String VERSION_PROPERTY = "version";
    public static final String WIKI_ID_PROPERTY = "wikiId";
    public static final String EIP_TWIKI_PROPERTY = "eipTWiki";

    public static final String HISTORY_ID_PK_COLUMN = "HISTORY_ID";

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void setUpdateUserId(Integer updateUserId) {
        writeProperty("updateUserId", updateUserId);
    }
    public Integer getUpdateUserId() {
        return (Integer)readProperty("updateUserId");
    }
    
    
    public void setVersion(Integer version) {
        writeProperty("version", version);
    }
    public Integer getVersion() {
        return (Integer)readProperty("version");
    }
    
    
    public void setWikiId(Integer wikiId) {
        writeProperty("wikiId", wikiId);
    }
    public Integer getWikiId() {
        return (Integer)readProperty("wikiId");
    }
    
    
    public void setEipTWiki(com.aimluck.eip.cayenne.om.portlet.EipTWiki eipTWiki) {
        setToOneTarget("eipTWiki", eipTWiki, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTWiki getEipTWiki() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTWiki)readProperty("eipTWiki");
    } 
    
    
}
