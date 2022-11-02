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

public val TwotoneGroup.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.14f, 19.5f)
                curveTo(20.91f, 17.7f, 22.0f, 15.22f, 22.0f, 12.5f)
                curveTo(22.0f, 6.98f, 17.52f, 2.5f, 12.0f, 2.5f)
                curveTo(6.48f, 2.5f, 2.0f, 6.98f, 2.0f, 12.5f)
                curveTo(2.0f, 15.22f, 3.08f, 17.68f, 4.84f, 19.49f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9991f, 21.5002f)
                curveTo(13.8659f, 21.5002f, 15.3792f, 19.987f, 15.3792f, 18.1202f)
                curveTo(15.3792f, 16.2535f, 13.8659f, 14.7402f, 11.9991f, 14.7402f)
                curveTo(10.1324f, 14.7402f, 8.6191f, 16.2535f, 8.6191f, 18.1202f)
                curveTo(8.6191f, 19.987f, 10.1324f, 21.5002f, 11.9991f, 21.5002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.25f, 12.0f)
                horizontalLineTo(16.0f)
                curveTo(16.82f, 12.0f, 17.5f, 11.33f, 17.5f, 10.5f)
                curveTo(17.5f, 9.68f, 16.82f, 9.0f, 16.0f, 9.0f)
                curveTo(15.18f, 9.0f, 14.5f, 9.67f, 14.5f, 10.5f)
                verticalLineTo(11.25f)
                curveTo(14.5f, 11.66f, 14.84f, 12.0f, 15.25f, 12.0f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
