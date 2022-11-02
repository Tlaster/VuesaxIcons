package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Receipttext: ImageVector
    get() {
        if (_receipttext != null) {
            return _receipttext!!
        }
        _receipttext = Builder(name = "Receipttext", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.83f, 2.94f, 22.3f, 3.6f, 21.8f)
                lineTo(5.31f, 20.52f)
                curveTo(5.71f, 20.22f, 6.27f, 20.26f, 6.63f, 20.62f)
                lineTo(8.29f, 22.29f)
                curveTo(8.68f, 22.68f, 9.32f, 22.68f, 9.71f, 22.29f)
                lineTo(11.39f, 20.61f)
                curveTo(11.74f, 20.26f, 12.3f, 20.22f, 12.69f, 20.52f)
                lineTo(14.4f, 21.8f)
                curveTo(15.06f, 22.29f, 16.0f, 21.82f, 16.0f, 21.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 2.9f, 16.9f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(7.0f)
                horizontalLineTo(6.0f)
                curveTo(3.0f, 2.0f, 2.0f, 3.79f, 2.0f, 6.0f)
                verticalLineTo(7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                verticalLineTo(8.42f)
                curveTo(22.0f, 10.0f, 21.0f, 11.0f, 19.42f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.01f)
                curveTo(16.0f, 2.9f, 16.91f, 2.0f, 18.02f, 2.0f)
                curveTo(19.11f, 2.01f, 20.11f, 2.45f, 20.83f, 3.17f)
                curveTo(21.55f, 3.9f, 22.0f, 4.9f, 22.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9805f, 9.0f)
                horizontalLineTo(12.0005f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineTo(7.96f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.75f, 13.0f)
                horizontalLineTo(11.25f)
            }
        }
        .build()
        return _receipttext!!
    }

private var _receipttext: ImageVector? = null
