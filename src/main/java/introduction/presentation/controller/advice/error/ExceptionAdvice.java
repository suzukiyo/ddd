package introduction.presentation.controller.advice.error;

import introduction.presentation.response.error.type.ErrorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface ExceptionAdvice {

    Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);

    static void outputErrorLog(ErrorType type, Exception exception) {
        logger.error( "Status = " + type + " : " + exception.toString() );
    }

    static void outputWarnLog(ErrorType type, Exception exception) {
        logger.warn( "Status = " + type + " : " + exception.toString() );
    }
}
