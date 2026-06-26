package com.sravani.studentapi.dto;

public class AIRecommendationResponseDTO {

    private String recommendation;

    public AIRecommendationResponseDTO(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRecommendation() {
        return recommendation;
    }
}

