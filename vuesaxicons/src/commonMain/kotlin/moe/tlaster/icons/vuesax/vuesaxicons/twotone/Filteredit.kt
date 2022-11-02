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

public val TwotoneGroup.Filteredit: ImageVector
    get() {
        if (_filteredit != null) {
            return _filteredit!!
        }
        _filteredit = Builder(name = "Filteredit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4105f, 20.7898f)
                lineTo(12.0005f, 21.6998f)
                curveTo(10.6905f, 22.5098f, 8.8705f, 21.5998f, 8.8705f, 19.9798f)
                verticalLineTo(14.6298f)
                curveTo(8.8705f, 13.9198f, 8.4705f, 13.0098f, 8.0605f, 12.5098f)
                lineTo(4.2205f, 8.4698f)
                curveTo(3.7105f, 7.9598f, 3.3105f, 7.0598f, 3.3105f, 6.4498f)
                verticalLineTo(4.1298f)
                curveTo(3.3105f, 2.9198f, 4.2206f, 2.0098f, 5.3306f, 2.0098f)
                horizontalLineTo(18.6705f)
                curveTo(19.7805f, 2.0098f, 20.6906f, 2.9197f, 20.6906f, 4.0297f)
                verticalLineTo(6.2498f)
                curveTo(20.6906f, 7.0598f, 20.1805f, 8.0698f, 19.6805f, 8.5698f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0802f, 11.8899f)
                lineTo(13.5401f, 15.4299f)
                curveTo(13.4001f, 15.5699f, 13.2701f, 15.8299f, 13.2401f, 16.0199f)
                lineTo(13.0501f, 17.3699f)
                curveTo(12.9801f, 17.8599f, 13.3202f, 18.1999f, 13.8102f, 18.1299f)
                lineTo(15.1601f, 17.9399f)
                curveTo(15.3501f, 17.9099f, 15.6202f, 17.7799f, 15.7502f, 17.6399f)
                lineTo(19.2901f, 14.0999f)
                curveTo(19.9001f, 13.4899f, 20.1901f, 12.7799f, 19.2901f, 11.8799f)
                curveTo(18.4001f, 10.9899f, 17.6902f, 11.2799f, 17.0802f, 11.8899f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5801f, 12.3901f)
                curveTo(16.8801f, 13.4701f, 17.72f, 14.3101f, 18.8f, 14.6101f)
            }
        }
        .build()
        return _filteredit!!
    }

private var _filteredit: ImageVector? = null
