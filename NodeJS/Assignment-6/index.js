const Koa = require('koa');
const app = new Koa();

app.use(async (ctx, next) => {
    if (ctx.path === '/') {
        ctx.status = 200;
        ctx.body = '<h1>Welcome to Index Page!</h1>';
    } else if (ctx.path === '/index') {
        ctx.status = 200;
        ctx.body = '<h1>Welcome to Index Page!</h1>';
    } else if (ctx.path === '/about') {
        ctx.status = 200;
        ctx.body = '<h1>Welcome to About Page!</h1>';
    } else if (ctx.path === '/contact') {
        ctx.status = 200;
        ctx.body = '<h1>Welcome to Contact Page!</h1>';
    } else {
        ctx.status = 404;
        ctx.body = '<h1>404 Page Not Found!</h1>';
    }
    await next();
})

const port = 3000;

app.listen(port, () => {
    console.log(`Server started at port ${port}.`);
})
