package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Liketag: ImageVector
    get() {
        if (_liketag != null) {
            return _liketag!!
        }
        _liketag = Builder(name = "Liketag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6504f, 13.8f)
                lineTo(11.2604f, 15.05f)
                curveTo(11.4704f, 15.26f, 11.9404f, 15.3599f, 12.2504f, 15.3599f)
                horizontalLineTo(14.2304f)
                curveTo(14.8504f, 15.3599f, 15.5304f, 14.89f, 15.6904f, 14.27f)
                lineTo(16.9404f, 10.4799f)
                curveTo(17.2004f, 9.7499f, 16.7304f, 9.13f, 15.9504f, 9.13f)
                horizontalLineTo(13.8704f)
                curveTo(13.5604f, 9.13f, 13.3004f, 8.87f, 13.3504f, 8.51f)
                lineTo(13.6104f, 6.8499f)
                curveTo(13.7104f, 6.3799f, 13.4004f, 5.8599f, 12.9304f, 5.7099f)
                curveTo(12.5104f, 5.5499f, 11.9904f, 5.7599f, 11.7904f, 6.0699f)
                lineTo(9.6604f, 9.24f)
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
                moveTo(3.0f, 4.97f)
                curveTo(3.0f, 3.33f, 4.34f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.0f, 21.0f, 3.33f, 21.0f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(21.0f, 17.52f, 19.66f, 18.85f, 18.0f, 18.85f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.85f, 15.68f, 19.16f, 15.12f, 19.72f)
                lineTo(13.41f, 21.41f)
                curveTo(12.63f, 22.18f, 11.36f, 22.18f, 10.58f, 21.41f)
                lineTo(8.87f, 19.72f)
                curveTo(8.31f, 19.16f, 7.54f, 18.85f, 6.75f, 18.85f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.85f, 3.0f, 17.52f, 3.0f, 15.88f)
                verticalLineTo(9.07f)
            }
        }
        .build()
        return _liketag!!
    }

private var _liketag: ImageVector? = null
