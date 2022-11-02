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

public val TwotoneGroup.Timerstart: ImageVector
    get() {
        if (_timerstart != null) {
            return _timerstart!!
        }
        _timerstart = Builder(name = "Timerstart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(7.17f, 22.0f, 3.25f, 18.08f, 3.25f, 13.25f)
                curveTo(3.25f, 8.42f, 7.17f, 4.5f, 12.0f, 4.5f)
                curveTo(16.83f, 4.5f, 20.75f, 8.42f, 20.75f, 13.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9004f, 18.4998f)
                verticalLineTo(17.3398f)
                curveTo(14.9004f, 15.9098f, 15.9204f, 15.3198f, 17.1604f, 16.0398f)
                lineTo(18.1604f, 16.6198f)
                lineTo(19.1604f, 17.1998f)
                curveTo(20.4004f, 17.9198f, 20.4004f, 19.0898f, 19.1604f, 19.8098f)
                lineTo(18.1604f, 20.3898f)
                lineTo(17.1604f, 20.9698f)
                curveTo(15.9204f, 21.6898f, 14.9004f, 21.0998f, 14.9004f, 19.6698f)
                verticalLineTo(18.4998f)
                close()
            }
        }
        .build()
        return _timerstart!!
    }

private var _timerstart: ImageVector? = null
