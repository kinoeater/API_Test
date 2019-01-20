# API_Test
https://jsonplaceholder.typicode.com/posts (GET) is a mock API endpoint which
simulates the retrievals of blog posts. Implement the following test scenarios:
Scenario: Counting posts for user <user>
When I get a list of blog posts using the API endpoint
Then user <user> should have <numposts> posts.
The scenario should execute with the following values of
(<user>,<numposts>): (5,10), (7,10), (9,10)

Scenario: Unique ID per post
When I get a list of blog posts using the API endpoint
Then each blog post should have a unique ID
