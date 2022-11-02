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

public val LinearGroup.Cloudconnection: ImageVector
    get() {
        if (_cloudconnection != null) {
            return _cloudconnection!!
        }
        _cloudconnection = Builder(name = "Cloudconnection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.37f, 9.5099f)
                curveTo(2.29f, 9.7999f, 2.3f, 15.7099f, 6.37f, 15.9999f)
                horizontalLineTo(16.03f)
                curveTo(17.2f, 16.0099f, 18.33f, 15.5699f, 19.2f, 14.7799f)
                curveTo(22.06f, 12.2799f, 20.53f, 7.2799f, 16.76f, 6.7999f)
                curveTo(15.41f, -1.3401f, 3.62f, 1.7499f, 6.41f, 9.5099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                verticalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(13.1046f, 23.0f, 14.0f, 22.1046f, 14.0f, 21.0f)
                curveTo(14.0f, 19.8954f, 13.1046f, 19.0f, 12.0f, 19.0f)
                curveTo(10.8954f, 19.0f, 10.0f, 19.8954f, 10.0f, 21.0f)
                curveTo(10.0f, 22.1046f, 10.8954f, 23.0f, 12.0f, 23.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 21.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                horizontalLineTo(6.0f)
            }
        }
        .build()
        return _cloudconnection!!
    }

private var _cloudconnection: ImageVector? = null
