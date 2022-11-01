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

public val LinearGroup.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.01f, 11.22f)
                verticalLineTo(15.71f)
                curveTo(3.01f, 20.2f, 4.81f, 22.0f, 9.3f, 22.0f)
                horizontalLineTo(14.69f)
                curveTo(19.18f, 22.0f, 20.98f, 20.2f, 20.98f, 15.71f)
                verticalLineTo(11.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(13.83f, 12.0f, 15.18f, 10.51f, 15.0f, 8.68f)
                lineTo(14.34f, 2.0f)
                horizontalLineTo(9.67f)
                lineTo(9.0f, 8.68f)
                curveTo(8.82f, 10.51f, 10.17f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.31f, 12.0f)
                curveTo(20.33f, 12.0f, 21.81f, 10.36f, 21.61f, 8.35f)
                lineTo(21.33f, 5.6f)
                curveTo(20.97f, 3.0f, 19.97f, 2.0f, 17.35f, 2.0f)
                horizontalLineTo(14.3f)
                lineTo(15.0f, 9.01f)
                curveTo(15.17f, 10.66f, 16.66f, 12.0f, 18.31f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.64f, 12.0f)
                curveTo(7.29f, 12.0f, 8.78f, 10.66f, 8.94f, 9.01f)
                lineTo(9.16f, 6.8f)
                lineTo(9.64f, 2.0f)
                horizontalLineTo(6.59f)
                curveTo(3.97f, 2.0f, 2.97f, 3.0f, 2.61f, 5.6f)
                lineTo(2.34f, 8.35f)
                curveTo(2.14f, 10.36f, 3.62f, 12.0f, 5.64f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(10.33f, 17.0f, 9.5f, 17.83f, 9.5f, 19.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(19.5f)
                curveTo(14.5f, 17.83f, 13.67f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
