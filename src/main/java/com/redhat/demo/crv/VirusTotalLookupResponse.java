package com.redhat.demo.crv;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class VirusTotalLookupResponse implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Virus ID")
   private java.lang.String virusId;
   @org.kie.api.definition.type.Label("File is Malicious")
   private String fileIsMalicious;

   public VirusTotalLookupResponse()
   {
   }

   public java.lang.String getVirusId()
   {
      return this.virusId;
   }

   public void setVirusId(java.lang.String virusId)
   {
      this.virusId = virusId;
   }

   public java.lang.String getFileIsMalicious()
   {
      return this.fileIsMalicious;
   }

   public void setFileIsMalicious(java.lang.String fileIsMalicious)
   {
      this.fileIsMalicious = fileIsMalicious;
   }

   public VirusTotalLookupResponse(java.lang.String virusId,
         java.lang.String fileIsMalicious)
   {
      this.virusId = virusId;
      this.fileIsMalicious = fileIsMalicious;
   }

}