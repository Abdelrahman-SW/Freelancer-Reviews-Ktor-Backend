package example.com.data

import example.com.Constants.BASE_URL
import kotlinx.serialization.Serializable

@Serializable
data class FreelancerReview(
    val name : String,
    val imageUrl : String
)


val freelancerReviews = listOf(
    FreelancerReview("Review1" , "$BASE_URL/freelancer_reviews/review1.jpeg"),
    FreelancerReview("Review2" , "$BASE_URL/freelancer_reviews/review2.jpeg"),
    FreelancerReview("Review3" , "$BASE_URL/freelancer_reviews/review3.jpeg"),
    FreelancerReview("Review4" , "$BASE_URL/freelancer_reviews/review4.jpeg"),
    FreelancerReview("Review5" , "$BASE_URL/freelancer_reviews/review5.jpeg")
)
