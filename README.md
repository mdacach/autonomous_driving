# autonomous_driving

This repository contains code from an old University Assignment on Concurrency.
We represent a road with multiple intersections, where cars must wait for their turn.
There is no unnecessary waiting; cars will always go as soon as possible as long as the road is secure (no chance for collision).
The waiting is solved through Java's Semaphores: each car acquires and releases the appropriate semaphores at the proper time.
Note that some intersections require multiple Semaphores, and the procedure is not straightforward (check development notes at the bottom). 

### Disclaimer:
I've unfortunately lost the development git history, so it starts with the complete working code.
I did some slight refactoring to improve the code somewhat, but I am neither a GUI nor Java developer, so I don't think
this code is of any great quality.

### Showcase videos
Although it uses Maven, I am not sure how easy it is to run the project, so here are some videos for showcasing.

Squares represent cars, and each route is the road's part with its respective primary color.
There are clockwise and counter-clockwise routes.

All cars at slow speed:

https://user-images.githubusercontent.com/43617028/168439757-6b901bb7-c5e7-41ca-93d3-f83a5c5629bb.mp4

All cars at full speed:

https://user-images.githubusercontent.com/43617028/168439766-fcf32c42-e1d2-4ed4-ba0b-aca137d7a912.mp4

Some fast, some slow:

https://user-images.githubusercontent.com/43617028/168439771-8ef98e08-fb8b-4714-853c-a287af667572.mp4

#### Note:
When I try to change the speeds during the video, it gets laggy, so I've done separate videos instead of a big one.

### Development:
All semaphores used and area of effect
![semaphores](https://user-images.githubusercontent.com/43617028/168439970-f98d6aed-47ff-45d2-8d5a-b691e84ec96c.jpeg)

All pixel points used for car's routes
![all_points](https://user-images.githubusercontent.com/43617028/168439975-4283056a-39da-4e5f-ac9f-a6b26302c2df.png)
