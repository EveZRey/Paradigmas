const fs = require("fs");
const path = require("path");

const directorio = "./ParadigmasProgramacion2020";
let html = `<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Paradigmas de Programación 3CM4</title>
    <style>
        body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; padding: 20px; background-color: #f4f4f9; color: #333; }
        h1 { color: #2c3e50; }
        ul { list-style-type: none; }
        li { margin: 8px 0; }
        a { text-decoration: none; color: #3498db; }
        a:hover { text-decoration: underline; color: #2980b9; }
        .folder { font-weight: bold; color: #2c3e50; margin-top: 10px;}
    </style>
</head>
<body>
    <h1>📚 Archivos de Paradigmas de Programación</h1>
    <ul>`;

function explorarDirectorio(dir) {
  const archivos = fs.readdirSync(dir);

  archivos.forEach((archivo) => {
    const rutaCompleta = path.join(dir, archivo);
    const stat = fs.statSync(rutaCompleta);

    if (stat.isDirectory()) {
      html += `<li class="folder">📁 ${archivo}<ul>`;
      explorarDirectorio(rutaCompleta);
      html += `</ul></li>`;
    } else {
      // Asegurar que las barras de la URL sean hacia adelante, incluso en Windows
      const rutaUrl = rutaCompleta.replace(/\\/g, "/");
      html += `<li>📄 <a href="${rutaUrl}" target="_blank">${archivo}</a></li>`;
    }
  });
}

explorarDirectorio(directorio);

html += `
    </ul>
</body>
</html>`;

fs.writeFileSync("index.html", html);
console.log("✅ Archivo index.html generado con éxito.");
