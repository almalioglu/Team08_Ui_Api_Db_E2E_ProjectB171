package techproed.pojos.vicedean.postTeacher;

import techproed.pojos.vicedean.postStudent.ObjectPostResponse;

import java.io.Serializable;

    public class TeacherPostResponseBI implements Serializable {
        private String httpStatus;
        private String message;
        private ObjectPostResponse object;


        public void setHttpStatus(String httpStatus){
            this.httpStatus = httpStatus;
        }

        public String getHttpStatus(){
            return httpStatus;
        }

        public void setMessage(String message){
            this.message = message;
        }

        public String getMessage(){
            return message;
        }

        public void setObject(ObjectPostResponse object){
            this.object = object;
        }

        public ObjectPostResponse getObject(){
            return object;
        }

        public TeacherPostResponseBI(String httpStatus, String message, ObjectPostResponse object) {
            this.httpStatus = httpStatus;
            this.message = message;
            this.object = object;
        }

        public TeacherPostResponseBI() {
        }

        @Override
        public String toString(){
            return
                    "TeacherPostResponse{" +
                            "httpStatus = '" + httpStatus + '\'' +
                            ",message = '" + message + '\'' +
                            ",object = '" + object + '\'' +
                            "}";
        }
    }




