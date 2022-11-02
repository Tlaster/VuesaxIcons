package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Mirroringscreen: ImageVector
    get() {
        if (_mirroringscreen != null) {
            return _mirroringscreen!!
        }
        _mirroringscreen = Builder(name = "Mirroringscreen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 5.0f, 4.0f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 3.0f, 22.0f, 5.0f, 22.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 19.0f, 20.0f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6904f, 11.71f)
                curveTo(8.3104f, 12.3f, 11.7004f, 15.7f, 12.3004f, 20.32f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6201f, 15.0698f)
                curveTo(6.0101f, 15.4998f, 8.5001f, 17.9998f, 8.9401f, 21.3898f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9805f, 18.8599f)
                curveTo(3.6705f, 19.0799f, 4.9205f, 20.3199f, 5.1405f, 22.0199f)
            }
        }
        .build()
        return _mirroringscreen!!
    }

private var _mirroringscreen: ImageVector? = null
