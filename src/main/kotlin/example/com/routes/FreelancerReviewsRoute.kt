package example.com.routes

import example.com.data.freelancerReviews
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.randomFreelancerReview() {
    get("/random_freelancer_review") {
        call.respond(
            HttpStatusCode.OK,
            freelancerReviews.random()
        )
    }
}