function sendMessage(){

  let input = document.getElementById("userInput");
  let chatbox = document.getElementById("chatbox");

  let userText = input.value;

  if(userText === "") return;

  chatbox.innerHTML += "<p><b>You:</b> " + userText + "</p>";

  let reply = "Stay calm and keep moving forward.";

  if(userText.toLowerCase().includes("sad")){
    reply = "Even warriors feel sad. Take a deep breath.";
  }
  else if(userText.toLowerCase().includes("stress")){
    reply = "Slow down. One step at a time.";
  }
  else if(userText.toLowerCase().includes("angry")){
    reply = "A true warrior needs no anger.";
  }

  chatbox.innerHTML += "<p><b>Peace Bot:</b> " + reply + "</p>";

  input.value = "";
}
