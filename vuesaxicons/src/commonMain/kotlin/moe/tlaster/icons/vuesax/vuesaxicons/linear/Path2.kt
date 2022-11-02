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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Path2: ImageVector
    get() {
        if (_path2 != null) {
            return _path2!!
        }
        _path2 = Builder(name = "Path2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(9.87f, 22.0001f)
                    horizontalLineTo(14.16f)
                    curveTo(15.78f, 22.0001f, 16.85f, 20.8401f, 16.53f, 19.4301f)
                    lineTo(15.84f, 16.3501f)
                    horizontalLineTo(8.2f)
                    lineTo(7.51f, 19.4301f)
                    curveTo(7.2f, 20.7601f, 8.34f, 22.0001f, 9.87f, 22.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(15.83f, 16.3501f)
                    lineTo(18.77f, 13.7401f)
                    curveTo(20.41f, 12.2801f, 20.48f, 11.2601f, 19.18f, 9.6101f)
                    lineTo(13.99f, 3.0301f)
                    curveTo(12.9f, 1.6501f, 11.12f, 1.6501f, 10.02f, 3.0301f)
                    lineTo(4.84f, 9.6101f)
                    curveTo(3.54f, 11.2601f, 3.54f, 12.3301f, 5.25f, 13.7401f)
                    lineTo(8.19f, 16.3501f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(12.01f, 2.6699f)
                    verticalLineTo(6.9699f)
                }
            }
        }
        .build()
        return _path2!!
    }

private var _path2: ImageVector? = null
