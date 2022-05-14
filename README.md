# autonomous_driving

This repository contains code from an old University Assignment on Concurrency.
We represent a road with multiple intersections, where cars must wait for their appropriate turn.
No unnecessary waiting is done, cars will always go as soon as possible, if the road is secure (no chance for collision).
The waiting is solved through Java's Semaphores: each car acquires and releases the appropriates semaphores in the appropriate time.
Note that some intersections require multiple Semaphores, and the procedure is not straight-forward. 

### Disclaimer:
I've unfortunately lost the development git history, so it starts with the full working code.
Some refactoring was done to make the code somewhat better, but I am neither a GUI nor Java developer, so I don't think
this
code is of particular quality.

### Showcase videos
I am not sure how easy it is to run the project, although it uses Maven, so here is some showcasing.

Cars are represented by squares, and each route is the road's part with respective main color.
There are clockwise and counter-clockwise routes.

All cars at slow speed:

https://user-images.githubusercontent.com/43617028/168439757-6b901bb7-c5e7-41ca-93d3-f83a5c5629bb.mp4

All cars at full speed:

https://user-images.githubusercontent.com/43617028/168439766-fcf32c42-e1d2-4ed4-ba0b-aca137d7a912.mp4

Some fast, some slow:

https://user-images.githubusercontent.com/43617028/168439771-8ef98e08-fb8b-4714-853c-a287af667572.mp4

#### Note:
For some reason, when I try to change the speeds during the video it gets laggy, so I've done separate videos instead of a big one.

### Development:
All semaphores used and area of effect
![semaphores](https://user-images.githubusercontent.com/43617028/168439970-f98d6aed-47ff-45d2-8d5a-b691e84ec96c.jpeg)

All pixel points used for Car's routes
![all_points](https://user-images.githubusercontent.com/43617028/168439975-4283056a-39da-4e5f-ac9f-a6b26302c2df.png)
