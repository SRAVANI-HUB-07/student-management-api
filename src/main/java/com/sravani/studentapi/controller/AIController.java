package com.sravani.studentapi.controller;

import com.sravani.studentapi.dto.AIRecommendationRequestDTO;
import com.sravani.studentapi.dto.AIRecommendationResponseDTO;
import com.sravani.studentapi.service.AIService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://student-management-frontend-nine-delta.vercel.app"
})
@RequestMapping("/ai")
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/recommendation")
    public AIRecommendationResponseDTO generateRecommendation(
            @RequestBody AIRecommendationRequestDTO request) {

        String recommendation = aiService.generateRecommendation(request);

        return new AIRecommendationResponseDTO(recommendation);
    }
}
