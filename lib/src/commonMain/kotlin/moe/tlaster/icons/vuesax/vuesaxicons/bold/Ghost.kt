package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.58f, 2.0f, 12.18f)
                verticalLineTo(20.07f)
                curveTo(2.0f, 21.33f, 2.75f, 21.67f, 3.67f, 20.83f)
                lineTo(4.67f, 19.92f)
                curveTo(5.04f, 19.58f, 5.64f, 19.58f, 6.01f, 19.92f)
                lineTo(8.01f, 21.75f)
                curveTo(8.38f, 22.09f, 8.98f, 22.09f, 9.35f, 21.75f)
                lineTo(11.35f, 19.92f)
                curveTo(11.72f, 19.58f, 12.32f, 19.58f, 12.69f, 19.92f)
                lineTo(14.69f, 21.75f)
                curveTo(15.06f, 22.09f, 15.66f, 22.09f, 16.03f, 21.75f)
                lineTo(18.03f, 19.92f)
                curveTo(18.4f, 19.58f, 19.0f, 19.58f, 19.37f, 19.92f)
                lineTo(20.37f, 20.83f)
                curveTo(21.29f, 21.67f, 22.04f, 21.33f, 22.04f, 20.07f)
                verticalLineTo(12.18f)
                curveTo(22.0f, 6.58f, 17.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.62f)
                curveTo(13.31f, 6.62f, 14.38f, 7.69f, 14.38f, 9.0f)
                curveTo(14.38f, 10.31f, 13.31f, 11.38f, 12.0f, 11.38f)
                curveTo(10.69f, 11.38f, 9.62f, 10.31f, 9.62f, 9.0f)
                curveTo(9.62f, 7.69f, 10.69f, 6.62f, 12.0f, 6.62f)
                close()
                moveTo(16.45f, 14.6f)
                curveTo(15.14f, 15.58f, 13.57f, 16.07f, 12.0f, 16.07f)
                curveTo(10.43f, 16.07f, 8.86f, 15.58f, 7.55f, 14.6f)
                curveTo(7.22f, 14.35f, 7.15f, 13.88f, 7.4f, 13.55f)
                curveTo(7.65f, 13.22f, 8.12f, 13.15f, 8.45f, 13.4f)
                curveTo(10.54f, 14.97f, 13.46f, 14.97f, 15.55f, 13.4f)
                curveTo(15.88f, 13.15f, 16.35f, 13.22f, 16.6f, 13.55f)
                curveTo(16.85f, 13.88f, 16.78f, 14.35f, 16.45f, 14.6f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
