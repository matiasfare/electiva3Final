package com.github.electica3Final.web.response;

public class HeartBeatResponseDTO extends com.github.electica3Final.web.response.BaseResponseDTO {


    public HeartBeatResponseDTO() {
        super();
    }

    public HeartBeatResponseDTO(HeartBeatBuilder builder) {
        super(builder);
    }

    public static HeartBeatBuilder builder() {
        return new HeartBeatBuilder();
    }

    public static class HeartBeatBuilder extends Builder<HeartBeatBuilder> {

        protected HeartBeatBuilder() {
            super(HeartBeatBuilder.class);
        }

        public HeartBeatResponseDTO build() {
            return new HeartBeatResponseDTO(this);
        }
    }
}
