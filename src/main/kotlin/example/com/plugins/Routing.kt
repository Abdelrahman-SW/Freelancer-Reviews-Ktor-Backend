package example.com.plugins

import example.com.routes.randomFreelancerReview
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        randomFreelancerReview()
        staticResources("", "static")
    }
}
