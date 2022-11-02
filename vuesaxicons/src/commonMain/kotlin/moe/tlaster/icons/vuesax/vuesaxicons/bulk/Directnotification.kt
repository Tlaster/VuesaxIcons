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

public val BulkGroup.Directnotification: ImageVector
    get() {
        if (_directnotification != null) {
            return _directnotification!!
        }
        _directnotification = Builder(name = "Directnotification", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                curveTo(20.6569f, 8.0f, 22.0f, 6.6568f, 22.0f, 5.0f)
                curveTo(22.0f, 3.3431f, 20.6569f, 2.0f, 19.0f, 2.0f)
                curveTo(17.3431f, 2.0f, 16.0f, 3.3431f, 16.0f, 5.0f)
                curveTo(16.0f, 6.6568f, 17.3431f, 8.0f, 19.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.34f, 12.72f)
                horizontalLineTo(17.03f)
                curveTo(16.1f, 12.72f, 15.27f, 13.24f, 14.85f, 14.06f)
                lineTo(14.05f, 15.64f)
                curveTo(13.86f, 16.02f, 13.48f, 16.25f, 13.06f, 16.25f)
                horizontalLineTo(9.95f)
                curveTo(9.66f, 16.25f, 9.23f, 16.19f, 8.96f, 15.63f)
                lineTo(8.17f, 14.06f)
                curveTo(7.75f, 13.23f, 6.92f, 12.71f, 5.99f, 12.71f)
                horizontalLineTo(2.66f)
                curveTo(2.3f, 12.72f, 2.0f, 13.02f, 2.0f, 13.38f)
                verticalLineTo(16.47f)
                curveTo(2.0f, 19.94f, 4.07f, 22.0f, 7.53f, 22.0f)
                horizontalLineTo(15.49f)
                curveTo(18.75f, 22.0f, 20.76f, 20.21f, 21.0f, 17.04f)
                verticalLineTo(13.38f)
                curveTo(21.0f, 13.02f, 20.7f, 12.72f, 20.34f, 12.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 9.5f)
                curveTo(16.52f, 9.5f, 14.5f, 7.48f, 14.5f, 5.0f)
                curveTo(14.5f, 4.28f, 14.69f, 3.61f, 14.99f, 3.0f)
                horizontalLineTo(7.52f)
                curveTo(4.07f, 3.0f, 2.0f, 5.06f, 2.0f, 8.52f)
                verticalLineTo(16.47f)
                curveTo(2.0f, 19.94f, 4.07f, 22.0f, 7.52f, 22.0f)
                horizontalLineTo(15.47f)
                curveTo(18.93f, 22.0f, 20.99f, 19.94f, 20.99f, 16.48f)
                verticalLineTo(9.01f)
                curveTo(20.39f, 9.31f, 19.72f, 9.5f, 19.0f, 9.5f)
                close()
            }
        }
        .build()
        return _directnotification!!
    }

private var _directnotification: ImageVector? = null
