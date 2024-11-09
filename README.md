## Title of the Project

Vision Voice is an assistive mobile application designed to provide visually impaired individuals with real-time auditory descriptions of their environment.Vision Voice allows users to capture images of their surroundings and receive spoken feedback in either English or Tamil.

## About

Vision Voice is designed to address this need by providing a cost-effective, accessible, and versatile tool that converts visual information into auditory descriptions. This paper presents the design, development, and testing of Vision Voice, a mobile application that enables visually impaired users to capture images with their smartphone camera and receive voice-based feedback in English or Tamil. By leveraging advanced image recognition algorithms and the Gemini speech synthesis system, Vision Voice provides real-time, multi-language feedback, empowering users to gain a more comprehensive understanding of their surroundings.

## Features 

- Multi-Language Voice Output
- Real-Time Processing and Feedback
- Scenic Viewing in Natural and Cultural Heritage Sites
- Less time complexity. 

 
## Requirements

* Operating System: 64-bit OS (Windows 10/11, macOS, or Linux) for compatibility with Android Studio and app development.
* Development Environment: Android Studio (latest version) for building the Android app and integrating the necessary libraries.
* Programming Language: Java or Kotlin for Android development.
* Image Processing Library: Integration of the Gemini API for image description; handling image capturing and processing in the app.
* Speech Recognition and Synthesis: Google Text-to-Speech (TTS) API for voice output, supporting English and Tamil languages.
* API Integration: Connectivity to the Gemini API to send images and receive descriptions.
* Version Control: Use of Git for version control to manage code and collaborate.
* Testing Devices: Android smartphone or emulator for testing the app functionalities.
* IDE**: Android Studio as the IDE for app development and debugging.
* Additional Dependencies: Retrofit for API calls, Gson for JSON parsing, and other Android-specific libraries (e.g., Glide for image loading).

## System Architecture
### Overview of System Components
The Vision Voice application is built around three core components:
1.Image Capture: The smartphone's camera is used to capture images of the surrounding environment.
2.Image Processing: The captured images are processed using a convolutional neural network (CNN) to identify objects, people, and other relevant details.
3.Voice Output: The identified objects and scene descriptions are then converted into spoken feedback using the Gemini voice synthesis system. The system supports both English and Tamil, offering users the ability to select their preferred language.

###  Technology Stack
1.Development Environment: Android Studio
2.Programming Languages: Java, Kotlin
3.Image Recognition: TensorFlow Lite (lightweight CNN)
4.Speech Synthesis: Gemini Voice Engine for English and Tamil
5.Database: Firebase (for user settings and preferences)
6.Frameworks and APIs: Android Jetpack, Retrofit for API handling, Google Text-to-Speech API for integration


## Output 

#### Output1 - APP INTERFACE

![WhatsApp Image 2024-11-09 at 21 41 00_74371d10](https://github.com/user-attachments/assets/fff60885-22ee-4b2c-bce4-ff0c6beda75b)


#### Output2 - TAKE PIC USER INTERFACE:

![WhatsApp Image 2024-11-09 at 21 46 56_e9f8a1c4](https://github.com/user-attachments/assets/28e8bed2-f055-4bfe-913e-b954f2391fcb)


#### Output3 - AUDIO OUTPUT:

![WhatsApp Image 2024-11-09 at 21 47 35_508ac169](https://github.com/user-attachments/assets/36c46873-8fa4-40cc-9abc-d956636d0978) 

 

## Results and Impact
The Vision Voice project significantly enhances accessibility for blind individuals and children by providing a user-friendly tool that describes their surroundings through images. By integrating image recognition and voice synthesis, the app helps users understand the context of the captured environment in both English and Tamil. This empowers users with independence and enriches their ability to engage with their surroundings, improving their quality of life.

The project's integration of computer vision with natural language processing also demonstrates its potential for revolutionizing assistive technologies. By providing both text and audio descriptions, Vision Voice is a step toward a more inclusive and accessible digital landscape.

This project paves the way for future developments in visual accessibility tools, contributing to a society that is more mindful of the needs of individuals with visual impairments.

## Articles published / References

1.R. K. Rajan, S. S. Sharma, and M. R. Menon, “Enhancing Accessibility for Visually Impaired Users Through AI-powered Image Descriptions,” Journal of Assistive Technology, vol. 15, no. 2, May 2024.

2.A. Kumar, V. D. Reddy, and P. G. Naidu, “Building Inclusive Android Apps: Combining Computer Vision and Voice Output for the Visually Impaired,” Proceedings of the International Conference on Accessibility and Assistive Technologies, Jan. 2024.

3.M. S. Tan, R. K. Sahu, “Developing Multilingual Assistive Tools for Children with Disabilities,” International Journal of Human-Computer Interaction, vol. 11, no. 4, Aug. 2024.



