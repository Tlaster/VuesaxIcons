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

public val TwotoneGroup.Microphone2: ImageVector
    get() {
        if (_microphone2 != null) {
            return _microphone2!!
        }
        _microphone2 = Builder(name = "Microphone2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                curveTo(14.21f, 15.5f, 16.0f, 13.71f, 16.0f, 11.5f)
                verticalLineTo(6.0f)
                curveTo(16.0f, 3.79f, 14.21f, 2.0f, 12.0f, 2.0f)
                curveTo(9.79f, 2.0f, 8.0f, 3.79f, 8.0f, 6.0f)
                verticalLineTo(11.5f)
                curveTo(8.0f, 13.71f, 9.79f, 15.5f, 12.0f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6094f, 6.4301f)
                curveTo(11.5094f, 6.1001f, 12.4894f, 6.1001f, 13.3894f, 6.4301f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1992f, 8.5498f)
                curveTo(11.7292f, 8.4098f, 12.2792f, 8.4098f, 12.8092f, 8.5498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3496f, 9.6504f)
                verticalLineTo(11.3504f)
                curveTo(4.3496f, 15.5704f, 7.7796f, 19.0004f, 11.9996f, 19.0004f)
                curveTo(16.2196f, 19.0004f, 19.6496f, 15.5704f, 19.6496f, 11.3504f)
                verticalLineTo(9.6504f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                verticalLineTo(22.0f)
            }
        }
        .build()
        return _microphone2!!
    }

private var _microphone2: ImageVector? = null
