package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Videotick: ImageVector
    get() {
        if (_videotick != null) {
            return _videotick!!
        }
        _videotick = Builder(name = "Videotick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 15.22f, 22.0f, 15.44f, 21.98f, 15.65f)
                curveTo(21.16f, 14.64f, 19.91f, 14.0f, 18.5f, 14.0f)
                curveTo(17.44f, 14.0f, 16.46f, 14.37f, 15.69f, 14.99f)
                curveTo(14.65f, 15.81f, 14.0f, 17.08f, 14.0f, 18.5f)
                curveTo(14.0f, 19.34f, 14.24f, 20.14f, 14.65f, 20.82f)
                curveTo(14.92f, 21.27f, 15.26f, 21.66f, 15.66f, 21.98f)
                curveTo(15.45f, 22.0f, 15.23f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.52f, 7.1099f)
                horizontalLineTo(21.48f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.52f, 2.1099f)
                verticalLineTo(6.9699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.48f, 2.1099f)
                verticalLineTo(6.5199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 18.5f)
                curveTo(23.0f, 19.34f, 22.76f, 20.14f, 22.35f, 20.82f)
                curveTo(22.11f, 21.22f, 21.81f, 21.58f, 21.46f, 21.88f)
                curveTo(20.67f, 22.58f, 19.64f, 23.0f, 18.5f, 23.0f)
                curveTo(17.43f, 23.0f, 16.44f, 22.62f, 15.67f, 21.98f)
                horizontalLineTo(15.66f)
                curveTo(15.26f, 21.66f, 14.92f, 21.27f, 14.65f, 20.82f)
                curveTo(14.24f, 20.14f, 14.0f, 19.34f, 14.0f, 18.5f)
                curveTo(14.0f, 17.08f, 14.65f, 15.81f, 15.69f, 14.99f)
                curveTo(16.46f, 14.37f, 17.44f, 14.0f, 18.5f, 14.0f)
                curveTo(19.91f, 14.0f, 21.16f, 14.64f, 21.98f, 15.65f)
                curveTo(22.62f, 16.42f, 23.0f, 17.42f, 23.0f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.75f, 18.5001f)
                lineTo(17.86f, 19.6101f)
                lineTo(20.26f, 17.3901f)
            }
        }
        .build()
        return _videotick!!
    }

private var _videotick: ImageVector? = null
