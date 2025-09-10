<script>
    document.getElementById('login-form').addEventListener('submit', async function(event) {
        event.preventDefault();

        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;

        try {
            const response = await fetch('http://localhost:8080/auth/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    username: username,
                    password: password
                })
            });

            const text = await response.text();

            if (response.ok) {
                if (text.includes("Cadastro Realizado")) {
                    alert("Login realizado com sucesso!");
                    window.location.href = "dashboard.html"; // ou a página que você quiser
                } else {
                    alert("Erro no login: " + text);
                }
            } else {
                alert("Erro no servidor: " + text);
            }

        } catch (err) {
            console.error(err);
            alert("Erro ao conectar ao servidor.");
        }
    });
</script>