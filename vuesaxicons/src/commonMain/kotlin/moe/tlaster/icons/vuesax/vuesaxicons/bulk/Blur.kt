package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Blur: ImageVector
    get() {
        if (_blur != null) {
            return _blur!!
        }
        _blur = Builder(name = "Blur", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.6103f, 2.21f)
                curveTo(12.2503f, 1.93f, 11.7503f, 1.93f, 11.3903f, 2.21f)
                curveTo(9.4903f, 3.66f, 3.8803f, 8.39f, 3.9103f, 13.9f)
                curveTo(3.9103f, 18.36f, 7.5403f, 22.0f, 12.0103f, 22.0f)
                curveTo(16.4803f, 22.0f, 20.1103f, 18.37f, 20.1103f, 13.91f)
                curveTo(20.1203f, 8.48f, 14.5003f, 3.67f, 12.6103f, 2.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.09f, 14.2f)
                curveTo(20.07f, 14.81f, 19.98f, 15.41f, 19.82f, 15.99f)
                lineTo(12.75f, 19.43f)
                verticalLineTo(21.97f)
                curveTo(12.5f, 21.99f, 12.25f, 22.0f, 12.0f, 22.0f)
                curveTo(11.75f, 22.0f, 11.5f, 21.99f, 11.25f, 21.97f)
                verticalLineTo(2.31f)
                curveTo(11.3f, 2.27f, 11.34f, 2.24f, 11.38f, 2.21f)
                curveTo(11.75f, 1.93f, 12.25f, 1.93f, 12.61f, 2.21f)
                curveTo(12.65f, 2.24f, 12.7f, 2.28f, 12.75f, 2.32f)
                verticalLineTo(7.76f)
                lineTo(16.53f, 5.92f)
                curveTo(16.86f, 6.3f, 17.17f, 6.69f, 17.48f, 7.1f)
                curveTo(17.44f, 7.14f, 17.4f, 7.17f, 17.35f, 7.19f)
                lineTo(12.75f, 9.43f)
                verticalLineTo(12.76f)
                lineTo(19.04f, 9.7f)
                curveTo(19.05f, 9.7f, 19.05f, 9.69f, 19.06f, 9.69f)
                curveTo(19.28f, 10.14f, 19.47f, 10.6f, 19.62f, 11.08f)
                lineTo(12.75f, 14.43f)
                verticalLineTo(17.76f)
                lineTo(19.37f, 14.54f)
                lineTo(20.09f, 14.2f)
                close()
            }
        }
        .build()
        return _blur!!
    }

private var _blur: ImageVector? = null
