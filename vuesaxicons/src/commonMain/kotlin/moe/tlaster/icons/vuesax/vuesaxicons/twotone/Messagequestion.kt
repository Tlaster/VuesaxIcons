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

public val TwotoneGroup.Messagequestion: ImageVector
    get() {
        if (_messagequestion != null) {
            return _messagequestion!!
        }
        _messagequestion = Builder(name = "Messagequestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 18.4302f)
                horizontalLineTo(13.0f)
                lineTo(8.55f, 21.3902f)
                curveTo(7.89f, 21.8302f, 7.0f, 21.3602f, 7.0f, 20.5602f)
                verticalLineTo(18.4302f)
                curveTo(4.0f, 18.4302f, 2.0f, 16.4302f, 2.0f, 13.4302f)
                verticalLineTo(7.4302f)
                curveTo(2.0f, 4.4302f, 4.0f, 2.4302f, 7.0f, 2.4302f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 2.4302f, 22.0f, 4.4302f, 22.0f, 7.4302f)
                verticalLineTo(13.4302f)
                curveTo(22.0f, 16.4302f, 20.0f, 18.4302f, 17.0f, 18.4302f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 11.3599f)
                verticalLineTo(11.1499f)
                curveTo(11.9998f, 10.4699f, 12.4198f, 10.1099f, 12.8398f, 9.8199f)
                curveTo(13.2498f, 9.5399f, 13.6598f, 9.1799f, 13.6598f, 8.5199f)
                curveTo(13.6598f, 7.5999f, 12.9198f, 6.8599f, 11.9998f, 6.8599f)
                curveTo(11.0798f, 6.8599f, 10.3398f, 7.5999f, 10.3398f, 8.5199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9955f, 13.75f)
                horizontalLineTo(12.0045f)
            }
        }
        .build()
        return _messagequestion!!
    }

private var _messagequestion: ImageVector? = null
