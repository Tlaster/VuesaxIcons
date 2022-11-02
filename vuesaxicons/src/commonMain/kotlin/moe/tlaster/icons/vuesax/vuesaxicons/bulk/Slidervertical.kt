package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Slidervertical: ImageVector
    get() {
        if (_slidervertical != null) {
            return _slidervertical!!
        }
        _slidervertical = Builder(name = "Slidervertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9405f, 3.5f)
                horizontalLineTo(5.0606f)
                curveTo(4.6505f, 3.5f, 4.3106f, 3.16f, 4.3106f, 2.75f)
                curveTo(4.3106f, 2.34f, 4.6505f, 2.0f, 5.0606f, 2.0f)
                horizontalLineTo(18.9405f)
                curveTo(19.3505f, 2.0f, 19.6905f, 2.34f, 19.6905f, 2.75f)
                curveTo(19.6905f, 3.16f, 19.3505f, 3.5f, 18.9405f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9405f, 22.0f)
                horizontalLineTo(5.0606f)
                curveTo(4.6505f, 22.0f, 4.3106f, 21.66f, 4.3106f, 21.25f)
                curveTo(4.3106f, 20.84f, 4.6505f, 20.5f, 5.0606f, 20.5f)
                horizontalLineTo(18.9405f)
                curveTo(19.3505f, 20.5f, 19.6905f, 20.84f, 19.6905f, 21.25f)
                curveTo(19.6905f, 21.66f, 19.3505f, 22.0f, 18.9405f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.75f, 7.6001f)
                verticalLineTo(16.4001f)
                curveTo(2.75f, 18.0601f, 4.09f, 19.4001f, 5.75f, 19.4001f)
                horizontalLineTo(18.25f)
                curveTo(19.91f, 19.4001f, 21.25f, 18.0601f, 21.25f, 16.4001f)
                verticalLineTo(7.6001f)
                curveTo(21.25f, 5.9401f, 19.91f, 4.6001f, 18.25f, 4.6001f)
                horizontalLineTo(5.75f)
                curveTo(4.09f, 4.6001f, 2.75f, 5.9401f, 2.75f, 7.6001f)
                close()
            }
        }
        .build()
        return _slidervertical!!
    }

private var _slidervertical: ImageVector? = null
