#include <iostream>
#include <string>

// Function to check if a string contains the word 'cloud'
bool isCloud(const std::string& str) {
  return str.find("cloud") != std::string::npos;
}

int main() {
  std::cout << "Hello, World!" << std::endl;

  // Example usage of the cloudbees function
  if (isCloud("This string contains the word 'cloud'")) {
    std::cout << "The string contains the word 'cloud'" << std::endl;
  } else {
    std::cout << "The string does not contain the word 'cloud'" << std::endl;
  }

  return 0;
}