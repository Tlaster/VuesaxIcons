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

public val BoldGroup.Receiptedit: ImageVector
    get() {
        if (_receiptedit != null) {
            return _receiptedit!!
        }
        _receiptedit = Builder(name = "Receiptedit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.78f, 2.0f)
                horizontalLineTo(8.22f)
                curveTo(4.44f, 2.0f, 3.5f, 3.01f, 3.5f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.5f, 20.96f, 4.96f, 21.59f, 6.73f, 19.69f)
                lineTo(6.74f, 19.68f)
                curveTo(7.56f, 18.81f, 8.81f, 18.88f, 9.52f, 19.83f)
                lineTo(10.53f, 21.18f)
                curveTo(11.34f, 22.25f, 12.65f, 22.25f, 13.46f, 21.18f)
                lineTo(14.47f, 19.83f)
                curveTo(15.19f, 18.87f, 16.44f, 18.8f, 17.26f, 19.68f)
                curveTo(19.04f, 21.58f, 20.49f, 20.95f, 20.49f, 18.29f)
                verticalLineTo(7.04f)
                curveTo(20.5f, 3.01f, 19.56f, 2.0f, 15.78f, 2.0f)
                close()
                moveTo(14.84f, 9.99f)
                lineTo(14.34f, 10.5f)
                horizontalLineTo(14.33f)
                lineTo(11.3f, 13.53f)
                curveTo(11.17f, 13.66f, 10.9f, 13.8f, 10.71f, 13.82f)
                lineTo(9.36f, 14.02f)
                curveTo(8.87f, 14.09f, 8.53f, 13.74f, 8.6f, 13.26f)
                lineTo(8.79f, 11.9f)
                curveTo(8.82f, 11.71f, 8.95f, 11.45f, 9.08f, 11.31f)
                lineTo(12.12f, 8.28f)
                lineTo(12.62f, 7.77f)
                curveTo(12.95f, 7.44f, 13.32f, 7.2f, 13.72f, 7.2f)
                curveTo(14.06f, 7.2f, 14.43f, 7.36f, 14.84f, 7.77f)
                curveTo(15.74f, 8.67f, 15.45f, 9.38f, 14.84f, 9.99f)
                close()
            }
        }
        .build()
        return _receiptedit!!
    }

private var _receiptedit: ImageVector? = null
