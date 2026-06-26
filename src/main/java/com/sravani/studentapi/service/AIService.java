package com.sravani.studentapi.service;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionCreateParams;
import com.sravani.studentapi.dto.AIRecommendationRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    private final OpenAIClient client;

    public AIService() {
        this.client = OpenAIOkHttpClient.fromEnv();
    }

    public String generateRecommendation(AIRecommendationRequestDTO request) {

        String prompt =
                "Create a 4-week study plan for a student.\n" +
                        "Student name: " + request.getStudentName() + "\n" +
                        "Interest: " + request.getInterest() + "\n" +
                        "Skill level: " + request.getSkillLevel() + "\n" +
                        "Weekly study hours: " + request.getWeeklyHours() + "\n" +
                        "Keep it practical, beginner-friendly, and structured.";

        ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_4_1_MINI)
                .addUserMessage(prompt)
                .build();

        ChatCompletion chatCompletion = client.chat()
                .completions()
                .create(params);

        return chatCompletion.choices()
                .get(0)
                .message()
                .content()
                .orElse("No recommendation generated.");
    }
}