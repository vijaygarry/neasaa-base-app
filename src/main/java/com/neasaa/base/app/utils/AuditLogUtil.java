package com.neasaa.base.app.utils;

import com.neasaa.base.app.entity.OperationEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AuditLogUtil {

  private static final Logger AUDIT_LOG = LogManager.getLogger("AUDIT_LOG");

  public static void log(
      OperationEntity operationEntity,
      String requestString,
      String responseString,
      int httpResponseCode) {

    String operationId = operationEntity != null ? operationEntity.getOperationId() : "UNKNOWN";
    AUDIT_LOG.info(
        "AUDIT | operationId={} | httpResponseCode={} | request={} | response={}",
        operationId,
        httpResponseCode,
        requestString,
        responseString);
  }
}
