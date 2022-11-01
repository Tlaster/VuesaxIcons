package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Liketag: ImageVector
    get() {
        if (_liketag != null) {
            return _liketag!!
        }
        _liketag = Builder(name = "Liketag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.65f, 13.8f)
                lineTo(11.26f, 15.05f)
                curveTo(11.47f, 15.26f, 11.94f, 15.3599f, 12.25f, 15.3599f)
                horizontalLineTo(14.23f)
                curveTo(14.85f, 15.3599f, 15.53f, 14.89f, 15.69f, 14.27f)
                lineTo(16.94f, 10.4799f)
                curveTo(17.2f, 9.7499f, 16.73f, 9.13f, 15.95f, 9.13f)
                horizontalLineTo(13.87f)
                curveTo(13.56f, 9.13f, 13.3f, 8.87f, 13.35f, 8.51f)
                lineTo(13.61f, 6.8499f)
                curveTo(13.71f, 6.3799f, 13.4f, 5.8599f, 12.93f, 5.7099f)
                curveTo(12.51f, 5.5499f, 11.99f, 5.7599f, 11.79f, 6.0699f)
                lineTo(9.66f, 9.24f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 13.8f)
                verticalLineTo(8.71f)
                curveTo(7.0f, 7.98f, 7.31f, 7.72f, 8.04f, 7.72f)
                horizontalLineTo(8.56f)
                curveTo(9.29f, 7.72f, 9.6f, 7.98f, 9.6f, 8.71f)
                verticalLineTo(13.8f)
                curveTo(9.6f, 14.53f, 9.29f, 14.79f, 8.56f, 14.79f)
                horizontalLineTo(8.04f)
                curveTo(7.31f, 14.79f, 7.0f, 14.53f, 7.0f, 13.8f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.86f, 3.0f, 17.53f, 3.0f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(3.0f, 3.34f, 4.34f, 2.01f, 6.0f, 2.01f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.01f, 21.0f, 3.34f, 21.0f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21.0f, 17.52f, 19.66f, 18.86f, 18.0f, 18.86f)
                close()
            }
        }
        .build()
        return _liketag!!
    }

private var _liketag: ImageVector? = null
