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

public val LinearGroup.Slidervertical: ImageVector
    get() {
        if (_slidervertical != null) {
            return _slidervertical!!
        }
        _slidervertical = Builder(name = "Slidervertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.62f, 6.0f, 18.17f, 6.02f, 18.66f, 6.09f)
                curveTo(21.29f, 6.38f, 22.0f, 7.62f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 16.38f, 21.29f, 17.62f, 18.66f, 17.91f)
                curveTo(18.17f, 17.98f, 17.62f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(6.38f, 18.0f, 5.83f, 17.98f, 5.34f, 17.91f)
                curveTo(2.71f, 17.62f, 2.0f, 16.38f, 2.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 7.62f, 2.71f, 6.38f, 5.34f, 6.09f)
                curveTo(5.83f, 6.02f, 6.38f, 6.0f, 7.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 17.9999f)
                curveTo(17.62f, 17.9999f, 18.17f, 17.9799f, 18.66f, 17.9099f)
                curveTo(18.67f, 18.0499f, 18.67f, 18.1799f, 18.67f, 18.3299f)
                verticalLineTo(18.6699f)
                curveTo(18.67f, 21.3299f, 18.0f, 21.9999f, 15.33f, 21.9999f)
                horizontalLineTo(8.67f)
                curveTo(6.0f, 21.9999f, 5.33f, 21.3299f, 5.33f, 18.6699f)
                verticalLineTo(18.3299f)
                curveTo(5.33f, 18.1799f, 5.33f, 18.0499f, 5.34f, 17.9099f)
                curveTo(5.83f, 17.9799f, 6.38f, 17.9999f, 7.0f, 17.9999f)
                horizontalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.67f, 2.0f)
                horizontalLineTo(15.33f)
                curveTo(18.0f, 2.0f, 18.67f, 2.67f, 18.67f, 5.33f)
                verticalLineTo(5.67f)
                curveTo(18.67f, 5.82f, 18.67f, 5.95f, 18.66f, 6.09f)
                curveTo(18.17f, 6.02f, 17.62f, 6.0f, 17.0f, 6.0f)
                horizontalLineTo(7.0f)
                curveTo(6.38f, 6.0f, 5.83f, 6.02f, 5.34f, 6.09f)
                curveTo(5.33f, 5.95f, 5.33f, 5.82f, 5.33f, 5.67f)
                verticalLineTo(5.33f)
                curveTo(5.33f, 2.67f, 6.0f, 2.0f, 8.67f, 2.0f)
                close()
            }
        }
        .build()
        return _slidervertical!!
    }

private var _slidervertical: ImageVector? = null
