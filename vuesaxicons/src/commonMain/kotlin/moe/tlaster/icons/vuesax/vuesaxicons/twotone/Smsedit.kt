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

public val TwotoneGroup.Smsedit: ImageVector
    get() {
        if (_smsedit != null) {
            return _smsedit!!
        }
        _smsedit = Builder(name = "Smsedit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.5f, 2.0f, 19.0f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.0f, 4.0f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 3.5f, 22.0f, 5.0f, 22.0f, 8.5f)
                verticalLineTo(11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                lineTo(13.87f, 11.5f)
                curveTo(12.84f, 12.32f, 11.15f, 12.32f, 10.12f, 11.5f)
                lineTo(7.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2091f, 14.7698f)
                lineTo(15.6691f, 18.3098f)
                curveTo(15.5291f, 18.4498f, 15.3991f, 18.7098f, 15.3691f, 18.8998f)
                lineTo(15.1791f, 20.2498f)
                curveTo(15.1091f, 20.7398f, 15.4491f, 21.0798f, 15.9391f, 21.0098f)
                lineTo(17.2891f, 20.8198f)
                curveTo(17.4791f, 20.7898f, 17.7491f, 20.6598f, 17.8791f, 20.5198f)
                lineTo(21.4191f, 16.9798f)
                curveTo(22.0291f, 16.3698f, 22.3191f, 15.6598f, 21.4191f, 14.7598f)
                curveTo(20.5291f, 13.8698f, 19.8191f, 14.1598f, 19.2091f, 14.7698f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6992f, 15.2798f)
                curveTo(18.9992f, 16.3598f, 19.8392f, 17.1998f, 20.9192f, 17.4998f)
            }
        }
        .build()
        return _smsedit!!
    }

private var _smsedit: ImageVector? = null
