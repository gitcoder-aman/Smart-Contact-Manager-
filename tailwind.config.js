/** @type {import('tailwindcss').Config} */

import flowbite from 'flowbite/plugin'
export default {
  content: ["./src/main/resources/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [flowbite],
  darkMode: "class", // Enable dark mode support
};

