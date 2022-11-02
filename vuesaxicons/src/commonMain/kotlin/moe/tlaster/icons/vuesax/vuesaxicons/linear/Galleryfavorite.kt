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

public val LinearGroup.Galleryfavorite: ImageVector
    get() {
        if (_galleryfavorite != null) {
            return _galleryfavorite!!
        }
        _galleryfavorite = Builder(name = "Galleryfavorite", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                curveTo(10.1046f, 10.0f, 11.0f, 9.1046f, 11.0f, 8.0f)
                curveTo(11.0f, 6.8954f, 10.1046f, 6.0f, 9.0f, 6.0f)
                curveTo(7.8954f, 6.0f, 7.0f, 6.8954f, 7.0f, 8.0f)
                curveTo(7.0f, 9.1046f, 7.8954f, 10.0f, 9.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.12f, 5.1099f)
                curveTo(15.79f, 4.0699f, 16.18f, 2.7799f, 17.26f, 2.4299f)
                curveTo(17.83f, 2.2499f, 18.54f, 2.3999f, 18.94f, 2.9499f)
                curveTo(19.32f, 2.3799f, 20.05f, 2.2399f, 20.62f, 2.4299f)
                curveTo(21.71f, 2.7799f, 22.1f, 4.0699f, 21.77f, 5.1099f)
                curveTo(21.25f, 6.7499f, 19.45f, 7.6099f, 18.95f, 7.6099f)
                curveTo(18.44f, 7.6099f, 16.65f, 6.7699f, 16.12f, 5.1099f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.67f, 18.9501f)
                lineTo(7.6f, 15.6401f)
                curveTo(8.39f, 15.1101f, 9.53f, 15.1701f, 10.24f, 15.7801f)
                lineTo(10.57f, 16.0701f)
                curveTo(11.35f, 16.7401f, 12.61f, 16.7401f, 13.39f, 16.0701f)
                lineTo(17.55f, 12.5001f)
                curveTo(18.33f, 11.8301f, 19.59f, 11.8301f, 20.37f, 12.5001f)
                lineTo(22.0f, 13.9001f)
            }
        }
        .build()
        return _galleryfavorite!!
    }

private var _galleryfavorite: ImageVector? = null
