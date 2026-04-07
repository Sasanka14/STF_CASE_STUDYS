const menuIcon = document.querySelector('#menu-icon');
const navbar = document.querySelector('.nav-links');

menuIcon.onclick = () => {
  navbar.classList.toggle('active');
  menuIcon.classList.toggle('fa-xmark');
};

const form = document.querySelector(".contact-form");

form.addEventListener("submit", function(e){
  e.preventDefault();

  const name = form.querySelector("input[type='text']").value;
  const email = form.querySelector("input[type='email']").value;
  const message = form.querySelector("textarea").value;

  const mailtoLink = `mailto:sasankawrites14@gmail.com?subject=New Contact from ${name}&body=From: ${name}%0AEmail: ${email}%0A%0A${message}`;

  window.location.href = mailtoLink;
});
